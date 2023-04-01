#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<int> nums)
{
    int minimum = nums.size() / 2;
    sort(nums.begin(), nums.end());
    for (int i = 0; i < nums.size() - 1;)
    {
        if (nums[i] == nums[i + 1])
        {
            nums.erase(nums.begin() + i + 1);
   
        }
        else
        {
            i++;
        }
    }
    int maximum = nums.size();
    return min(minimum, maximum);
}