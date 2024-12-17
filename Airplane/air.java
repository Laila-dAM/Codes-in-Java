#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int alt = 1000;
int spd = 300;
int wnd = 0;
int turb = 0;

void adjAlt(int adj){
    alt += adj;
    if (alt < 0) alt = 0;
    else if (alt > 10000) alt = 10000;
}

void adjSpd(int adj){
    spd += adj;
    if (spd < 100) spd = 100;
    else if (spd > 600) spd = 600;
}
void simWthr(){
    wnd = rand() % 21 - 10;
    turb = rand() % 3;
}