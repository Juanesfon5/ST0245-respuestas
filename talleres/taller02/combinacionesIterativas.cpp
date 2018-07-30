#include <bits/stdc++.h>

using namespace std;

//Compljidad O(2 ^ N)
void combine(string s){ 
  for(int bit = 0; bit < (1 << s.length()); ++bit){
    for(int j = 0; j < s.length(); ++j){
      if((bit & (1 << j)) != 0){
        cout << s[j];
      }
    }
    cout << endl;
  }
}

int main(){
  string input;
  cin >> input;
  combine(input);
  return 0;
}