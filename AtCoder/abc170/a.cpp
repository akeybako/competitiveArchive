#include <stdio.h>

using namespace std;

int main(){
    int x_i;
    for (int i=0; i<5; i++) {
        scanf("%d", &x_i);
        if (x_i == 0) {
            printf("%d\n", i + 1);
            break;
        }
    }
}
