#include <stdio.h>
#include <algorithm>

using namespace std;

int main() {
    int array[3];
    for (int i=0; i<3; i++) {
        scanf("%d", &array[i]);
    }
    // バブルソート
    for (int i=2; i>0; i--) {
        for (int j=0; j<i; j++) {
            if (array[j] > array[j+1]) {
                swap(array[j], array[j+1]);
            }
        }
    }
    printf("%d %d %d", array[0], array[1], array[2]);
}