def intStream(n: Int): Stream[Int] = n #:: intStream(n + 1)

intStream(0) take 5 print