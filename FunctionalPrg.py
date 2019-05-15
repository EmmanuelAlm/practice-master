


🐸🐸🐸Functional Programming is a style of programming (as the name suggests) is based around functions.

A key part of functional programming is higher-order functions. We have seen this idea briefly in the previous lesson on functions as objects. 
Higher-order functions take other functions as arguments, or return them as results.

🐸🐸Example:

def apply_twice(func, arg):
   return func(func(arg))

def add_five(x):
   return x + 5

print(apply_twice(add_five, 10))

Result: 

>>>
20
>>>

🐸🐸🐸The function apply_twice takes another function as its argument, and calls it twice inside its body.


🐸🐸🐸Pure Functions Functional programming seeks to use pure functions. Pure functions have no side effects, and return a value that depends only on their argument.
THIS IS HOW FUNCTIONS IN MATH WORK: FOR EXAMPLE, THE COS(X) WILL, FOR THE SAME VALUE OF X, ALWAYS RETURN THE SAME RESULT.



🐸🐸Below are examples of pure and impure functions.

🐸Pure function:
def pure_function(x,y):
temp = x+2*y
return temp / (2*x+y)


PURE FUNCTIONS--

Using pure functions has both advantages and disadvantages. 
Pure functions are:
-easier to reason about and test.
-more effcient. Once the function has been evaluated for an input, the result can be stored and referred to the next time the function of that input is needed, reducing the number of times the function is called. This is called MEMOIZATION.
-easier to run in parallel.


The main disadvantage of using only pure functions is that they majorly complicate the otherwise simple task of I/O, since this appears to inherently require side effects. 
They can also be more difficult to write in some situations.The main disadvantage of using only pure functions is that they majorly complicate the otherwise simple task of I/O, since this appears to inherently require side effects. 






🐸Impure Function:

some_list = []

def impure(arg):
  some_list.append(arg) 
🐸🐸🐸The function above is not pure, because it changed the state of some_list.


