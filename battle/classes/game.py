from random import *


class bcolors:
    Header = '\033[95m'
    OkBlue = '\033[94m'
    OkGreen = '\033[92m'
    WARNING = '\033[953m'
    FAIL = '\033[951m'
    ENDC = '\033[0m'
    BOLD = '\033[1m'
    UNDERLINE = '\033[4m'


class Person:
    def __init__(self, hp, mp, atk, df, magic):
        self.maxhp = hp
        self.hp = hp
        self.maxmp = mp
        self.mp = mp 
        self.atkl = atk - 10
        self.atkh = atk + 10
        self.df = df
        self.magic = magic
        self.sctions = ["Attack, ", "Magic"]
    
    def generate_dmg(self):
        return randint(self.atkl, self.atkh)
    
    def generate_spell_dmg(self, i ):
        mgl = self.magic[i] ["dmg"] -5
        mgh = self.magic[i] ["dmg"] +5
        return randint(mgl, mgh)
    def take_dmg(self, dmg):
        self.hp -= dmg
        if self.hp < 0:
            self.hp = 0
        return self.hp

    def get__hp(self):
        return self.hp
    
    def get_max_hp(self):
        return self.maxhp
    
    def get_mp(self):
        return self.mp
    
    def get_max_mp(self):
        return self.maxmp

    def reduce_mp(self, cost):
        self.mp -= cost
    
    def get_spell_name(self, i):
        return self.magic[i] ["name"]

    def get_spell_mp_cost(self, i):
        return self.magic[i] ["cost"]

    def choose_action(self):
        i = 1
        print("Actions")
        for item in self.actions:
            print(str(i)+ ":", item)
            i += 1

    def choose_magic(self):
        i = 1
        print("Magic")
        for spell in self.magic:
            print(str(i)+ ":", spell["name"], "(cost:", str(spell["mp"]) + ")")

