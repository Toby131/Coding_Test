#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> lottos, vector<int> win_nums)
{
    vector<int> answer;
    int count = 0;
    int zero = 0;
    for(int i = 0 ; i < lottos.size(); i++)
    {
        if(lottos[i] == 0)
        {
            zero += 1;
        }
        
        for(int j = 0 ; j < lottos.size(); j++)
        {
            if(lottos[i] == win_nums[j])
            {
                count += 1;
            }
        }
    }
    
    if(count + zero == 6)
    {
        answer.push_back(1);
    }
    else if(count + zero == 5)
    {
        answer.push_back(2);
    }
    else if(count + zero == 4)
    {
        answer.push_back(3);
    }
    else if(count + zero == 3)
    {
        answer.push_back(4);
    }
    else if(count + zero == 2)
    {
        answer.push_back(5);
    }
    else if(count + zero == 1)
    {
        answer.push_back(6);
    }
    else if(count + zero == 0)
    {
        answer.push_back(6);
    }
    if(count != 0)
    {
        answer.push_back(7-count);
    }
    else
    {
        answer.push_back(6-count);
    }
    return answer;
}