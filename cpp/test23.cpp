#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    string temp;
    for(int i = 0 ; i < n ; i++)
    {
        for(int j = 0 ; j < n ; j++)
        {
            if(arr1[i] % 2 == 0 && arr2[i] % 2 == 0)
            {
                temp += " ";
            }
            else
            {
                temp += "#";
            }
            arr1[i] /= 2;
            arr2[i] /= 2;
        }
        reverse(temp.begin(), temp.end());
        answer.push_back(temp);
        temp.clear();
    }
    return answer;
}