

def find_primes(max_number):
  primes =[True for _ in range(0,max_number+1)]
  for i in range(2,max_number+1):
      if primes[i]:
          j = 2*i
          while j<= max_number:
              primes[j]=False
              j +=i
  return [i for i in range(2,len(primes)) if primes[i]]
