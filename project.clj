(defproject solresol "0.0.1-SNAPSHOT"
  :description  "SolReSol - a musical language"
  :url          "http://github.com/aaron-santos/solresol"
  :license      {:name "Eclipse Public License"
                 :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [overtone "0.8.0-SNAPSHOT"]]
  :main         ^{:skip-aot true} solresol.core
  :repl-init    solresol.core)
