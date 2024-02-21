# Eryantis - An Online Board Game

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

After downloading the JAR files, you can play Eriantys on your computer using either a Command-Line Interface (CLI) or a Graphical User Interface (GUI). Below are the steps to run the game in your preferred mode:

## Prerequisites
Before running the game, ensure you have Java installed on your computer. You need Java version 11 or higher. 
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

## Original repository:
[Link](https://github.com/umbertocolangelo/ingsw2022-AM29)
