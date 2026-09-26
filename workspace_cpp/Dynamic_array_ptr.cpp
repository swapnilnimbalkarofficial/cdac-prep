#include <iostream>
using namespace std;
int main()
{
    int n;
    int sum = 0;
    double average;
    cout << "Enter number of elements: ";
    cin >> n;
    int* arr = new int[n];
    cout << "Enter " << n << " elements:" << endl;
    for (int i = 0; i < n; i++)
    {
        cin >> *(arr + i);
        sum = sum + *(arr + i);
    }
    average = (double)sum / n;
    cout << "Sum = " << sum << endl;
    cout << "Average = " << average << endl;
    delete[] arr;
    return 0;
}