# Eriantys - An Online Board Game

![alt text](src/main/resources/Graphical_Assets/Eriantys_slider.jpg)

Implementation of the game table [Eriantys](https://www.craniocreations.it/prodotto/eriantys/).
Eriantys is a strategic board game created by Cranio Creations, where players compete to gain control over magical islands by deploying students, using professors' abilities, and leveraging unique character cards. The game features various elements such as magical creatures, islands to conquer, and special powers to outmaneuver opponents. This project presents a digital adaptation of Eriantys, developed as part of a bachelor's thesis. It features a comprehensive implementation that includes a graphical user interface (GUI), a command-line interface (CLI), and network capabilities through sockets, offering a full-fledged digital gaming experience.

**Teacher**: San Pietro Pierluigi

**Final Score**: 30/30 cum laude

## Documentation

### UML

- [Starting UML](deliveries/UML/UML_Iniziale/UML_Iniziale.jpg)
- [Final UML](deliveries/UML/UML_Final/FinalUML.png)

## Functionality implemented

| Functionality   |                       State                        |
|:----------------|:--------------------------------------------------:|
| Basic rules     | 🟢 |
| Complete rules  | 🟢 |
| Character Cards | 🟢 |
| Socket          | 🟢 |
| GUI             | 🟢 |
| CLI             | 🟢 |
| Persistence     | 🟢 |
# Running the Eriantys Game

Follow these steps to download, build, and run Eriantys on your computer. You can play Eriantys using either a Command-Line Interface (CLI) or a Graphical User Interface (GUI).

## Step 1: Download the Repository
First, you need to get the project files onto your computer.
  ```shell
  git clone https://github.com/vittoriolaferla/Eryantis/
```
## Step 2: Build the Project

After downloading or cloning the repository, the next step is to build the project and create the JAR files.

1. Open a terminal or command prompt.
2. Navigate to the main directory of the project (the location where you cloned or unzipped the repository).

   ```shell
   cd Eriantis
   ```
1. Run the Maven build command:
   ```shell
   mvn package
      ```
This command will compile the project and generate JAR files, saving them in a newly created 'target' directory within the project's main directory.
## Running the Game
Depending on your preference for the CLI or GUI version, follow the instructions below:
### CLI Version
Run the game using the command:
   ```sh
   java -jar AM29-clientCLI.jar
   ```
### GUI Version
Run the game using the command:

   ```sh
   java -jar AM29-clientGUI.jar
   ```
### Server
Start the server with the command:
 ```sh
java -jar AM29-server.jar
```
## Overall Test Coverage Summary

| Package     | Class % | Line % |
|:------------|:--------|:------:|
| all classes | 46%     |  20%   |
| model       | 100%    |  82%   |

## Group components
- [_Roberto Cialini_](https://github.com/RobertoCialini)
- [_Umberto Colangelo_](https://github.com/umbertocolangelo)
- [_Vittorio La Ferla_](https://github.com/vittoriolaferla)

## Screenshots
[Screenshots](https://github.com/vittoriolaferla/Eryantis/tree/main/screenshots)


## Original repository:
[Link](https://github.com/umbertocolangelo/ingsw2022-AM29)
