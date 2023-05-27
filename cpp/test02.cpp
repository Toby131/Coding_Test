#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> arr) 
{
    vector<int> answer;
    answer.push_back(arr[0]);
    for(int i = 0 ; i < arr.size()-1;)
    {
        if(arr[i] == arr[i+1])
            arr.erase(arr.begin() + i);
        else
        {
            i++;
            answer.push_back(arr[i]);
        }
    }
    return answer;
}
