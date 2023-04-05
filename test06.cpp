#include <iostream>
#include <string>
#include <vector>
#include <cstring>
using namespace std;

string solution(string new_id) 
{
    string answer = "";
    
    // 소문자 치환
    for(char& ch : new_id)
    {
        ch = tolower(ch);
    }
    // 소문자, 숫자, -, _, . 제외한 모든 문자 제거
    for(char ch : new_id)
    {
        if(isalpha(ch) || isdigit(ch) || strchr("-_.", ch))
            answer += ch;
    }
    // .가 두개 이상 -> 하나로
    int idx = -1;
    while((idx = answer.find("..")) != -1) //answer안에 ..이 있을 때 까지 돌기
    {
        answer.replace(idx, 2, ".");
    }
    // .가 처음이나 끝이면 제거
    if(answer.front() == '.')
    {
        answer = answer.substr(1);
    }
    if(answer.back() == '.')
    {
        answer = answer.substr(0, answer.length()-1);
    }
    //빈 문자열이면 a
    if(answer.empty())
    {
        answer="a";
    }
    //16자 이상이면 15개만 남기고 제거
    if(answer.size() > 15)
    {
        answer = answer.substr(0,15);
        if(answer.front() == '.')
        {
            answer = answer.substr(1);
        }
        if(answer.back() == '.')
        {
            answer = answer.substr(0, answer.length()-1);
        }
    }
    //길이 2자 이하면 마지막 문자 더 붙이기
    while(answer.size() < 3)
    {
        answer += answer.back();
    }
    return answer;
}