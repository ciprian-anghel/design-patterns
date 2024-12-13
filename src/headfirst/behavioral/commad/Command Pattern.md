# Strategy pattern (also known as Action, Transaction)
### The `Command Pattern` encapsulates a request as an object, letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.

- Command Interface - Define an interface for commands
- Concrete Commands - The implementation for each of the commands, includes details about receiver.
- The Receiver - The actual object that performs the action encapsulated in the commands.
- The Invoker - uses the Command interface to define its commands triggers.
- The Client - (Main) Responsible with creating commands implementations and set them to the invoker.
