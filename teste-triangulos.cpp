#include <iostream>

using namespace std;

int main()
{
    int LadoA, LadoB, LadoC;
    
    cout << "Isso é um triângulo que pode existir?" << endl;
    cout << "Digite o comprimento de cada lado, na ordem, Lado A, Lado B, Lado C" << endl;
    cin >> LadoA >> LadoB >> LadoC;
        if (LadoA + LadoB > LadoC && LadoB + LadoC > LadoA && LadoA + LadoC > LadoB){
            cout << "Seu triângulo é posível e";
            if (LadoA == LadoB && LadoA == LadoC){
                cout << " é Equilátero" << endl;
            }else   if (LadoA == LadoB || LadoA == LadoC || LadoB == LadoC ){
                cout << " é Isóscelses" << endl;
                }else   if (LadoA != LadoB != LadoC){
                    cout << " é Escaleno" << endl;
                }
        } else {
            cout << "Seu triângulo é impossivel" << endl;
        }
    return 0;
}

