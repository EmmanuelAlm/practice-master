
/*
Quarterly Sales Statistics
Write a program that lets the user enter four quarterly sales figures for six divisions of a company.
The figures should be stored in a two-dimensional array. Once the figures are entered, the 
program should display the following data for each quarter:
   • A list of the sales figures by division
   • Each division’s increase or decrease from the previous quarter (this will not be displayed for 
      the first quarter)
   • The total sales for the quarter
   • The average sales for all divisions that quarter
   • The division with the highest sales for that quarter
Input Validation: Do not accept negative numbers for sales figures.
*/
import static java.lang.System.out;
import java.util.Scanner;
public class QuarterSalesExample
{
     public static final int NUM_DIVISIONS = 6;
     String[] names = new String[NUM_DIVISIONS];
     double[][] figure = new double[names.length][4];
     static String[] Quarters = {"Names\\Quarters","Quarter 1","Quarter 2","Quarter 3","Quarter 4"};
    public void getInputs(){
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        for(int i=0;i<names.length;i++){
            out.print("Enter Name of Division: ");
            names[i] = in.next();
            out.println("Enter Quarterly Sales figures for division '"+names[i]+"'");
            out.println("Instructions: Put 'Q'<QuarterNumber>:<Figure> for entering each Quarterly figure.\nExample Input: Q1:12345");
            out.println("Type 'help' for the List of Available Commands.");
            while(true){
                out.print(">");
                String comm = in.next();
                if(comm.charAt(0)=='q'||comm.charAt(0)=='Q'){
                    if(comm.indexOf(":")==-1)continue;
                    double val = Double.parseDouble(comm.split(":")[1]!=null?comm.split(":")[1]:"0");
                    if(val<0){
                        out.println("Sales figure dipped below 0. Try Again.");
                        continue;
                    }
                    switch(comm.charAt(1)){
                        case '1':figure[i][0] = val;break;
                        case '2':figure[i][1] = val;break;
                        case '3':figure[i][2] = val;break;
                        case '4':figure[i][3] = val;break;
                        default: out.println("Invalid Quarter.");continue;
                    }
                    out.println("Sales figure for Quarter "+comm.charAt(1)+" entered.");
                }
                if(comm.toLowerCase().startsWith("return")){
                    out.println("\nYour Entry:");
                    displayAsTable(Quarters,new String[]{names[i]},convertToString(toSingleArray(i)));
                    out.print("\nConfirm?(y/n):");
                    if(in.next().toLowerCase().charAt(0)=='y')
                    break;
                }
                if(comm.toLowerCase().startsWith("display")){
                    displayAsTable(Quarters,new String[]{names[i]},convertToString(toSingleArray(i)));
                }
                if(comm.toLowerCase().startsWith("help")){
                    out.println("\n'return' - Enter Stop entering Sales Figures for this Division.\n'display' - View Data Entered.\n'help' - This message.");
                }
            }
        }
    }
    double[][] toSingleArray(int no){
        return new double[][]{figure[no]};
    }
    public void displayAsTable(String[] ColumnName, String[] RowName, String[][] data){
        int max_len = 0;
        for(int i=0;i<ColumnName.length;i++){
            if(max_len<ColumnName[i].length())
            max_len = ColumnName[i].length();
        }
        for(int i=0;i<RowName.length;i++){
            if(max_len<RowName[i].length())
            max_len = RowName[i].length();
        }
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data.length;j++){
                if(max_len<data[i][j].length())
                max_len = data[i][j].length();
            }
            
            
        }
        String hr = "+";
        for(int i=0;i<ColumnName.length;i++){
            for(int j=0;j<max_len;j++)
                hr+="-";
            hr+="+";
        }
        out.print(hr+"\n|");
        for(int i=0;i<ColumnName.length;i++){
            for(int l= ColumnName[i].length();l<max_len;l++)
                ColumnName[i]+=" ";
            out.print(ColumnName[i]+"|");
        }
        out.print("\n"+hr+"\n|");
        for(int i = 0;i<data.length;i++){
            for(int l= RowName[i].length();l<max_len;l++)
                    RowName[i]+=" ";
            out.print(RowName[i]+"|");
            for(int j=0;j<data[0].length;j++){
                for(int l= data[i][j].length();l<max_len;l++)
                    data[i][j]+=" ";
                out.print(data[i][j]+"|");
            }
            if(i!=data.length-1)
            out.print("\n"+hr+"\n|");
            else
            out.print("\n");
        }
        out.println(hr);
    }
    String[][] convertToString(double[][] input){
        String[][] out = new String[input.length][input[0].length];
        for(int i = 0;i<input.length;i++)
        for(int j=0;j<input[i].length;j++)
        out[i][j] = Double.toString(input[i][j]);
        return out;
    }
    String[][] convertToString(boolean[][] input){
        String[][] out = new String[input.length][input[0].length];
        for(int i = 0;i<input.length;i++)
        for(int j=0;j<input[i].length;j++)
        out[i][j] = input[i][j]?"\u2713":"";
        return out;
    }
    boolean[][] highestSalesPerQtr(){
        boolean[][] hi = new boolean[figure.length][figure[0].length];
        for(int i = 0;i<figure[0].length;i++){
            int max=0;
            for(int j=0;j<figure.length;j++)
            if(figure[max][i]<figure[j][i])
                max = j;
                hi[max][i] = true;
        }
        return hi;
    }
    double[][] avgSalesPerQtr(){
        double[][] avg = totalSalesPerQtr();
        for(int i = 0;i<avg[0].length;i++){
            avg[0][i] = avg[0][i]/figure.length;
        }
        return avg;
    }
    double[][] totalSalesPerQtr(){
        double[][] total = new double[1][figure[0].length];
        for(int i = 0;i<figure[0].length;i++){
            double sum = 0;
            for(int j=0;j<figure.length;j++){
                sum+=figure[j][i];
            }
            total[0][i] = sum;
        }
        return total;
    }
    double[][] diffSales(){
        double[][] diff = new double[figure.length][figure[0].length];
        for(int i = 0;i<figure.length;i++){
            for(int j=1;j<figure[i].length;j++){
                diff[i][j] = figure[i][j]-figure[i][j-1];
            }
        }
        return diff;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        out.println("------------------------------------------");
        out.println("                Accounting");
        out.println("------------------------------------------");
        out.println("                  Input");
        out.println("------------------------------------------");
        QuarterSalesExample sales = new QuarterSalesExample();
        sales.getInputs();
        out.println("------------------------------------------");
        out.println("                  Menu");
        out.println("------------------------------------------");
        out.println("1. Display Input");
        out.println("2. Display Average Sales");
        out.println("3. Display Total Sales");
        out.println("4. Highest Sales Per Quarter");
        out.println("5. Increase/Decrease in Sales Per Quarter");
        out.println("6. Exit");
        while(true){
            out.print(">");    
            switch(in.nextInt()){
                case 1:out.println("\nInput Data:");
                sales.displayAsTable(sales.Quarters,sales.names,sales.convertToString(sales.figure));
                break;
                case 2:out.println("\nAverage Sales Per Quarter:");
                sales.displayAsTable(Quarters,new String[]{"Average"},sales.convertToString(sales.avgSalesPerQtr()));
                break;
                case 3:out.println("\nTotal Sales Per Quarter:");
                sales.displayAsTable(Quarters,new String[]{"Total"},sales.convertToString(sales.totalSalesPerQtr()));
                break;
                case 4:out.println("\nHighest Sales Per Quarter:");
                sales.displayAsTable(Quarters,sales.names,sales.convertToString(sales.highestSalesPerQtr()));
                break;
                case 5:out.println("\nIncrease/Decrease in Sales Per Quarter:");
                sales.displayAsTable(Quarters,sales.names,sales.convertToString(sales.diffSales()));
                break;
                default:return;
            }
        }
    }
}
