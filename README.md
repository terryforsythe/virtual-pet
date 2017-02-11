VirtualPetApp class:
* Included Scanner() for inputs
* Gave pet owner an option to choose pet's name.
* Has a display of the pet's changing attributes.
* Pet menu included options: "Feed," "Water" and "Take to Potty".
* Tick() occurred after menu.
* Gave user option to do more with pet or leave.


VirtualPet class:
* feed() - decreases hunger, increases thirst and waste
* petRefusal() - Prints "GRRR!" when pet refuses
* potty() - decreases waste
* tick() - increases hunger and thirst

VirtualPetTest class tests:
* hunger_DecreasesWhenFeedOccurs()
* hunger_IncreasesByTick()
* thirst_DecreasesWhenWaterOccurs()
* thirst_IncreasesByTick()
* thirst_IncreasesWhenFeedOccurs()
* waste_DecreasesWhenPottyOccurs()
* waste_IncreasesWhenFeedOccurs()
* waste_IncreasesWhenWaterOccurs()
