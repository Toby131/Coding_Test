#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(int n) {
    int answer = 0;
    vector<int> v;
    while(n>0)
    {
        v.push_back(n%3);
        n/=3;
    }
    reverse(v.begin(), v.end());
    int num = 1;
    
    for(int i = 0; i < v.size(); i++)
    {
        answer += v[i]*num;
        num *=3;
    }
    return answer;
}