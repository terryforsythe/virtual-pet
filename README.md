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

VirtualPetTest tests:
* hunger_DecreaseWhenFeedOccurs()
* hunger_IncreaseByTick()
* thirst_DecreaseWhenWaterOccurs()
* thirst_IncreaseByTick()
* thirst_IncreaseWhenFeedOccurs()
* waste_DecreasesWhenPottyOccurs()
* waste_IncreasesWhenFeedOccurs()
* waste_IncreasesWhenWaterOccurs()