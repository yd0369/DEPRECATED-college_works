#include<iostream>
#include <cstack>
using namespace std;
int main()
{
std::stack< char > s;

for (char c = 'a'; c <= 'f'; c++)
{
s.push(c);
}
while (!s.empty())
{
std::cout << "Top element of stack \'"
<< s.top() <<"\'" << std::endl;
s.pop();
}
std::cout << "Stack is empty!" << std::endl;
}
