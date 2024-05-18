/* Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.*/
#include <string>
int find_short(std::string str){
  int count=0,i=0;
  for(int i=0;i<str.length();i++){
    if(str[i]==' ') count++;
    }
  std::string array[count+1];
  std::stringstream ssin(str);
  while(ssin.good() && i<count+1){
    ssin >> array[i];
    i++;}
  int min=array[0].length();
  for(int j=1;j<count+1;j++){
    if (array[j].length()<min) min=array[j].length();}
  return min;
}
