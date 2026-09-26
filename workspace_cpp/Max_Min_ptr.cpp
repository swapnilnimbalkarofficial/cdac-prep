#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter number of elements: ";
    cin >> n;

    int* arr = new int[n];
    cout << "Enter " << n << " elements:" << endl;

    for (int i = 0; i < n; i++)
    {
        cin >> *(arr + i);
    }
    int maximum = *arr;
    int minimum = *arr;
    for (int i = 1; i < n; i++)
    {
        if (*(arr + i) > maximum)
        {
            maximum = *(arr + i);
        }

        if (*(arr + i) < minimum)
        {
            minimum = *(arr + i);
        }
    }

    cout << "Largest element = " << maximum << endl;
    cout << "Smallest element = " << minimum << endl;
    delete[] arr;
    return 0;
}