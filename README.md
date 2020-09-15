## Jets Project

## Overview

In this project, a series of jets are inputed into a class using a file. Following this, a series of menu options are presented to the user. When the user inputs an option, information on the jets available is shown . The menu loops so that users have the chance to enter all menu options.

## Topics

*PrintMenu
The user is shown a menu (printMenu()) where they can enter an integer corresponding to the task they would like to perform.

*Taking User Input
After taking user input, a main menu is printed asking the user if they would list the fleet, fly all jets, view the jet with longest range, load all Cargo Jets, fight jets, add a jet to fleet, remove a jet from the fleet, or quit the program. This option is entered using a number corresponding to each of the options. A switch statement captures the option and calls a method or other option of choice.

*method printAirfieldJets
Calling the printAirfieldJets method iterates through a loop producing a printed toString for each Jet in the Airfield.

*method flyAll
Calling the flyAll method iterates through a loop producing a printing info on the amount of hours each jet can fly before running out of fuel.

*method fastestJet
Calling the fastestJet method prints out the fastest jet in the airfield .

*method longestRange
Calling the longestRange method prints out the jet with the longest range in the airfield .

*method loadingCargo
Calling the loadingCargo method displays a message indicating that cargo is being loaded onto the Cargo Planes.


*method fighting
Calling the fighting method displays a message indicating that Fighter Jets  are fighting.

*method addJet
Upon choosing option 7, the user is prompted to enter new information for a jet.
Calling the addJet method passes this user information as parameters. In return a new Jet is added to the jet list.

*method removeJet
Upon choosing option 8, the user is prompted to enter new the number of the jet they would liek to remove from the list. RemoveJet method passes this user information as a parameter. In return a jet is removed from the jet list.

*Quitting the program
When option 9 is chosen, the user quits the program by leaving the keepGoing while loop.

*FileInput
The class Airfield has a FileReader for reading "JetsList" file that contains the list of Jets used for this program.

*Arrays
The Airfield1 class holds the constructor Airfield1. This constructor holds the array jets that is the main array used for the main jets application.

*Classes, subclasses, and interfaces
The subclasses FighterJet, CargoPlane, and JetImpl all inherit from the abstract class Jets. CargoPlane implements the loadCargo method from the CargoCarrier interface, andFighterJet implements the fight() method from the CombatReady interface.

*Instructions
The user is prompted to choose from a series of options presented in a menu. Following this the user is prompted to request info for different outputs shared in the menu.

##Lessons learned
I learned more about the difference between a arrays and arraylists, and how their calls to functions differ. I also learned about how calls can be strung together (e.g. this.jets.get(fastestIndex).getSpeed())
