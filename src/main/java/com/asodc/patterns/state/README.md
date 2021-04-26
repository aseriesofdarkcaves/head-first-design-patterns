# State
_"The State Pattern allows an object to alter its behaviour when its internal state changes.
The object will appear to change its class."_

## TODO
- When a client calls turnCrank() in GumballMachine, we call dispense anyway, even though it
might be unnecessary. How might you fix this?

- I don't like the way SoldState and dispense() works.
It seems like it works differently from how the rest of the code works.

- All of the intelligence for the state transitions is in the State classes.
What problems might this cause? Would we want to move that logic into the Gumball Machine?
What would be the advantages and disadvantages of that?
