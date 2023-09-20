#include <stdio.h>

int main()
{
    float f;
    double d;
    // 계산하고자 하는 값 입력받기
    printf("float. 값을 입력하십시오: ");
    scanf("%f", &f);
    printf("double. 값을 입력하십시오: ");
    scanf("%lf", &d);
    // 열번 더하기
    float j = f + f + f + f + f + f + f + f + f + f;
    double u = d + d + d + d + d + d + d + d + d + d;
    // 계산결과 소수점 64자리까지 출력하기
    printf("float. 열번 더한 값: %.64f\n", j);
    printf("double. 열번 더한 값: %.64lf", u);
    return 0;
}