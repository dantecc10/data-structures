int despachar () {
	int despachado;
	if (!empty()) {
		despachado = queue[ini];
		for (int i = 1; i < fin; i++) {
			queue[i] = queue[i + 1];
		}
		fin--;
		return despachado;
	} else {
		printf("La cola está vacía.");
		return -1;
	}
}
