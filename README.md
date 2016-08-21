# buckotlin
Simple calculator that demonstrates kotlin support in buck

## Usage
This is extremely simple. It just supports integer math for addition, subtraction, mutiplication, and division.
The program expects 3 command line arguments: `<intr> <op> <int>` where `<int>` is an integer, and 
`<op>` is one of `"+" "-" "*" "/"` (you can typically drop the quotes for everything except *).

## To build
1. Using buck: You'll need to be using a vesion of buck that supports kotlin (https://github.com/facebook/buck/pull/810)
    `buck run src/com/dsyang/cli:bin <int> <op> <int>`
  
  example: 
  
  ```
  dsyang❯λ.buckotlin/(master) =buck run src/com/dsyang/cli:bin 5 + 100
[-] PROCESSING BUCK FILES...FINISHED 0.1s [100%] 🐳  New buck daemon
[-] DOWNLOADING... (0.00 B/S AVG, TOTAL: 0.00 B, 0 Artifacts)
[-] BUILDING...FINISHED 1.3s [100%] (1/1 JOBS, 0 UPDATED, 0 [0.0%] CACHE MISS)
105
  ```
2. Using Intellij:  Everthing except the run configuration should be set up already. 
The run configuration you create should include the args under "Program Arguments"
