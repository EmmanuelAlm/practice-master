from random import *


class Spell:
    def __init__(self, name, cost, dmg, type):
        self.name = name
        self.cost = cost
        self.dmg = dmg
        self.type = type

    def generate_dmg(self, dmg = None):
        low = self.dmg - 15
        high = self.dmg + 15
        return randint(low, high)
