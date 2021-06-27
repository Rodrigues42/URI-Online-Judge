inpuOne = input().split()
inpuTwo = input().split()

codOne, numOne, valueOne = inpuOne
codTwo, numTwo, valueTwo = inpuTwo

value = int(numOne) * float(valueOne) + int(numTwo) * float(valueTwo)

print(f'VALOR A PAGAR: R$ {value:.2f}')
