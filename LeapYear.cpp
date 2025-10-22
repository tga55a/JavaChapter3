#include <iostream>

// Logic:
// if its divisible by 4, its a leap year 
// HOWEVER, if it also happens to be divisible by 100, it MUST ALSO be divisible by 400
// or else it isnt a leap year

int main() {
    std::cout << "Enter a year to determine whether or not it is a leap year.";
    
    int year_input;
    std::cin >> year_input;
    
    if (year_input % 4 == 0) {
        if (year_input % 100 == 0 && year_input % 400 != 0) {
            std::cout << "This IS NOT a leap year!";
            return 1;
        }
        
        std::cout << "This IS a leap year!";
        return 0;
    } else {
        std::cout << "This IS NOT a leap year!";
        return 1;
    }
    
    return 0;
}
