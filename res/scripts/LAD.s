getblock 0 -1 0
gettype @block
.ifeq 5 @type wool
dig 0 -1 0
slot 1
place 0 -1 0
move 1 0 0
LAA
.ifeq 5 @type stone
dig 0 -1 0
slot 0
place 0 -1 0
move -1 0 0
LAC