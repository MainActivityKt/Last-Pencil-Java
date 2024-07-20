# Last Pencil

A simple but engaging pencil game in Java.

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

## Stage 4/5:

In this stage, a new level of control over the game has been added.
The program checks the input. If it is incorrect, the reason is printed. 

Also, the allowed amount of pencils which can be taken is limited;
Let's say that players can remove no more than 3 pencils at a time.

Run [FairPencilGame.java](src/main/java/lastpencil/FairPencilGame.java)

**Example 1**: the initial number of pencils is not numeric

    How many pencils would you like to use:
    > a
    The number of pencils should be numeric
    > 5
    Who will be the first (John, Jack):
    >

**Example 2**: the initial number of pencils equals 0

    How many pencils would you like to use:
    > 0
    The number of pencils should be positive
    > 20
    Who will be the first (John, Jack):
    >

**Example 3**: the chosen first player is not in the list

    How many pencils would you like to use:
    > 5
    Who will be the first (John, Jack):
    > Fatma
    Choose between 'John' and 'Jack'
    > John
    |||||
    John's turn!
    >

**Example 4**: one of the players has taken the number of pencils that differs from 1, 2, or 3

    How many pencils would you like to use:
    > 5
    Who will be the first (John, Jack):
    > John
    |||||
    John's turn!
    > 4
    Possible values: '1', '2' or '3'
    > 1
    ||||
    Jack's turn!
    >

**Example 5**: the chosen number of pencils is not numeric

    How many pencils would you like to use:
    > 5
    Who will be the first (John, Jack):
    > John
    |||||
    John's turn!
    > a
    Possible values: '1', '2' or '3'
    > 1
    ||||
    Jack's turn!
    >

**Example 6**: John is the winner of the game

    How many pencils would you like to use:
    > 5
    Who will be the first (John, Jack):
    > John
    |||||
    John's turn!
    > 3
    ||
    Jack's turn!
    > 3
    Too many pencils were taken
    > 2
    John won!

## Stage 5/5:The right strategy

After playing a couple of games, both
players found out that if there are `2`, `3`, or `4` pencils left on the table, the current player
automatically wins. It happens because a player can take `1`, `2`, or `3` pencils 
and leave the other player with only one. The other player has nothing left 
but to take the last pencil and lose the game.


The same thing happens when there are 6``, 7``, or `8` pencils left on the table.
It will eventually repeat all over again.


So, if the player chooses Jack as the first player, after that input, the bot's move should be printed.

### In this final stage, 
the program is expanded. The solution for last stage, can be
executed for any initial number of pencils. The second player (Jack), is the bot this time.

For each iteration, the program checks whose turn is
now. If it is the bot, instead of requiring input from the second player, one line
that contains the bot's move (1, 2 or 3) that follows the winning strategy, is printed.

Run [StablePencilGame.java](src/main/java/lastpencil/SimplePencil.java)

Example 1:

    How many pencils would you like to use:
    > 10
    Who will be the first (John, Jack):
    > Jack
    ||||||||||
    Jack's turn:
    1
    |||||||||
    John's turn!
    > 2
    |||||||
    Jack's turn:
    2
    |||||
    John's turn!
    > 1
    ||||
    Jack's turn:
    3
    |
    John's turn!
    > 1
    Jack won!

Example 2:

    How many pencils would you like to use:
    > 6
    Who will be the first (John, Jack):
    > John
    ||||||
    John's turn!
    > 1
    |||||
    Jack's turn:
    2
    |||
    John's turn!
    > 2
    |
    Jack's turn:
    1
    John won!