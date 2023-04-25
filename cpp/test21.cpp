using namespace std;

long long solution(int price, int money, int count)
{
    long long answer = 0;
    long long total_price=0;
    for(int i = 1 ; i < count+1; i++)
    {
        total_price += (price * i);
    }
    answer = money - total_price;
    if(answer >= 0)
        return 0;
    return answer * -1;
}