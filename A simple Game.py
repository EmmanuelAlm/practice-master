"""

Object orientation is very useful when different objects and their relations.

When making games this is very helpful

def get_input():
  command = input(": ").split()
  verb_word = command[0]
  if verb_word in verb_dict:
    verb = verb_dict[verb_word]
  else:
    print("Unknown verb {}". format(verb_word))
    return

  if len(command) >= 2:
    noun_word = command[1]
    print (verb(noun_word))
  else:
    print(verb("nothing"))

def say(noun):
  return 'You said "{}"'.format(noun)

verb_dict = {
  "say": say,
}

while True:
  get_input()

Result:
>>>
: say Hello!
You said "Hello!"
: say Goodbye!
You said "Goodbye!"

: test
Unknown verb test
class GameObject:
  class_name = ""
  desc = ""
  objects = {}

  def __init__(self, name):
    self.name = name
    GameObject.objects[self.class_name] = self

  def get_desc(self):
    return self.class_name + "\n" + self.desc

class Goblin(GameObject):
  class_name = "goblin"
  desc = "A foul creature"

goblin = Goblin("Gobbly")

def examine(noun):
  if noun in GameObject.objects:
    return GameObject.objects[noun].get_desc()
  else:
    return "There is no {} here.".format(noun)

We created a Goblin class, which inherits from the GameObjects class.
We also created a new function examine, which returns the objects description.
Now we can add a new "examine" verb to our dictionary and try it out!
verb_dict = {
  "say": say,
  "examine": examine,
}






>>>
: say Hello!
You said "Hello!"

: examine goblin
goblin
A foul creature

: examine elf
There is no elf here.
:
class Goblin(GameObject):
  def __init__(self, name):
    self.class_name = "goblin"
    self.health = 3
    self._desc = " A foul creature"
    super().__init__(name)

  @property
  def desc(self):
    if self.health >=3:
      return self._desc
    elif self.health == 2:
      health_line = "It has a wound on its knee."
    elif self.health == 1:
      health_line = "Its left arm has been cut off!"
    elif self.health <= 0:
      health_line = "It is dead."
    return self._desc + "\n" + health_line

  @desc.setter
  def desc(self, value):
    self._desc = value

def hit(noun):
  if noun in GameObject.objects:
    thing = GameObject.objects[noun]
    if type(thing) == Goblin:
      thing.health = thing.health - 1
      if thing.health <= 0:
        msg = "You killed the goblin!"
      else:
        msg = "You hit the {}".format(thing.class_name)
  else:
    msg ="There is no {} here.".format(noun)
  return msg



Result:
>>>
: hit goblin
You hit the goblin

: examine goblin
goblin
 A foul creature
It has a wound on its knee.

: hit goblin
You hit the goblin

: hit goblin
You killed the goblin!

: examine goblin
A goblin

goblin
 A foul creature
It is dead.
:










"""
