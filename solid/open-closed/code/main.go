package main

type Shape interface {
	Draw()
}

func main() {
	r := new(Rectangle)
	s := new(Square)
	shapes := []Shape{r, s}

	for _, e := range shapes {
		e.Draw()
	}
}
