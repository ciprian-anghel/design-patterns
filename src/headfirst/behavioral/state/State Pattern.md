# State pattern
### The `State Pattern` allows an  object to alter its behaviour when its internal state changes. The object will appear to change its class (changes its behaviour).

- Pattern encapsulates state into separate classes that delegates to the object representing the current state.
- Pattern looks similar with Strategy Pattern. They differ in its intent. 
	- State Pattern - a set of behaviours encapsulated in state objects, client does not know about the state.
					- think of an alternative to putting lots of conditionals
	- Strategy Pattern - client specifies the strategy object
					   - think of an alternative to class inheritance to define behaviours. The behaviour is added / changed through composition.