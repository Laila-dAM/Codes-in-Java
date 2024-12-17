#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int altitude = 1000;
int speed = 300;
int windSpeed = 0;
int turbulence = 0;

void adjustAltitude(int adjustment) {
    altitude += adjustment;
if (altitude < 0){
    altitude = 0;
} else if (altitude > 10000) {
    altitude = 10000;
}
}
