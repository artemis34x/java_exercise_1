# Usage
To use the repo, you need to install the [dependencies](#Dependencies) first. Then you can compile the java file to get the ".class" file.

```bash
$ ./compile.sh
```
It should create a "bin" directory. To run the project, use the command below :
```bash
$ java -cp bin Launcher
```
You should be prompted to an input menu
```bash
$ Bienvenue!
enter command :

```
### From here you can type :
- Fibo -> input a number to get fibo(x)
- Freq -> enter a path to a text file and get the 3 most used word in it
- Quit -> exiting the program
# Dependencies
- jdk 17.0(at least)
- javac
