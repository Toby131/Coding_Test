#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    int mini = arr[0];
    
    if(arr.size() < 2)
        answer.push_back(-1);
    else
    {
        for(int i = 0 ; i < arr.size() ; i++)
        {
            if(mini > arr[i])
                mini = arr[i];
            else
                continue;
        }
        for(int k = 0 ; k < arr.size() ; k++)
        {
            if(arr[k] == mini)
                arr.erase(arr.begin() + k);
        }
        answer = arr;
    }
    return answer;
}
