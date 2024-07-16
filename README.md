# Last Pencil

A simple but engaging game in Java.

## Stage 1/5:Empty the pencil case
In this stage, the program prints two lines: one line with several vertical bar symbols representing pencils 
(for example, `|||` or `|||||||`) and one `Your turn!` string.

Even though both pencils are acceptable, you can choose to get a large pencil, or a small one, by providing a
boolean value for the argument `largePencil` of the `getPencil()` function

Run [SimplePencil.java](src/main/java/lastpencil/SimplePencil.java)

Example: 

    |||
    Your turn!

## Stage 2/5:New rules:
Expanding the previous stage by getting a few detailed needed for the game initialization.

Run [CountedPencils.java](src/main/java/lastpencil/CountedPencils.java)

Example

    How many pencils would you like to use:
    > 20
    Who will be the first (John, Jack):
    > Jack
    ||||||||||||||||||||
    Jack is going first!

## Stage 3/5: Working on the gameplay
Let's change the rules of game. Players take turns taking `X` pencils until none of them remain.

Run [PencilGame.java](src/main/java/lastpencil/PencilGame.java)

Example 1 

    How many pencils would you like to use:
    > 5
    Who will be the first (John, Jack):
    > John
    |||||
    John's turn:
    > 2
    |||
    Jack's turn:
    > 1
    ||
    John's turn:
    > 2

Example 2:

    How many pencils would you like to use:
    > 15
    Who will be the first (John, Jack):
    > John
    |||||||||||||||
    John's turn:
    > 8
    |||||||
    Jack's turn:
    > 7
