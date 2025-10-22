#include <iostream>
#include <string>

int main() {
    
    std::cout << "Enter a year: ";
    int year_input;
    std::cin >> year_input;
    std::string Sign = "";
    
    year_input = year_input % 12;
    switch (year_input) {
        case 0:
            Sign = "Monkey";
            break;
        case 1: 
            Sign = "Rooster";
            break;
        case 2:
            Sign = "Dog";
            break;
        case 3:
            Sign = "Pig";
            break;
        case 4:
            Sign = "Rat";
            break;
        case 5:
            Sign = "Ox";
            break;
        case 6:
            Sign = "Tiger";
            break;
        case 7:
            Sign = "Rabbit";
            break;
        case 8: 
            Sign = "Dragon";
            break;
        case 9:
            Sign = "Snake";
            break;
        case 10:
            Sign = "Horse";
            break;
        case 11:
            Sign = "Sheep";
            break;
    }
    
    std::cout << Sign;
    
    return 0;
    
}