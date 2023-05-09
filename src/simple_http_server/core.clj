(ns simple-http-server.core
  (:require [ring.adapter.jetty :refer [run-jetty]])
  (:gen-class))

"* '/' Return string on base URL"
"* '/users' Return list of users"
"* '/users/:id' Return user by id"
"* '/users' POST a user"

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

(defn start []
  (run-jetty handler {:port 3000 
                      :join? false}))

(defn -main
  [& args]
  (start))
