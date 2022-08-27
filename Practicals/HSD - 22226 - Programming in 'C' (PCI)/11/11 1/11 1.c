#include <stdio.h>

main() {
    int arr[9999];
    int size;
    int i, j, temp;
    printf("Enter size of array: ");
    scanf("%d", & size);
    printf("Enter elements in array: ");

    for (i = 0; i < size; i++) {
        scanf("%d", & arr[i]);
    }

    for (i = 0; i < size; i++) {
        for (j = i + 1; j < size; j++) {
            if (arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    printf("\nElements of array in ascending order: ");

    for (i = 0; i < size; i++) {
        printf("%d\t", arr[i]);
    }
}