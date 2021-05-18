run:
	docker-compose -f stack.yml rm db
	docker-compose -f stack.yml up -d --build --force-recreate --no-deps

stop:
	docker-compose -f stack.yml stop
