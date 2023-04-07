#include <string>
#include <vector>

using namespace std;

int GCD(int n, int m)
{
	int r;
	while (m != 0)
	{
		r = n % m;
		n = m;
		m = r;
	}
	return n;
}

vector<int> solution(int n, int m) {
    vector<int> answer;
    answer.push_back(GCD(n,m));
    answer.push_back((n*m) / answer[0]);
    return answer;
}
