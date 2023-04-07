#include <string>
#include <vector>

using namespace std;

bool solution(int x) {
    bool answer = true;
    int x1 = x;
    int result=0;
    
    while(x > 0)
    {
        result += x % 10;
        x = x / 10 ;
    }
        
    if(x1 % result != 0)
    {
        answer = false;
    }
    else
        answer = true;
    return answer;
}
