# flight-amenity-search-service

### JSON SERVER

>cd json-server

>docker run -d -p 8002:80 --name ammserver -v {AbsolutePathToJsonFile}:/data/db.json clue/json-server

docker run -d -p 8002:80 --name ammserver -v "C:/Users/N4427/Documents/Git Projects/flight-amenity-search-service/json-server/ammenities.json":/data/db.json clue/json-server 

