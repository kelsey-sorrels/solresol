# solresol

A Clojure library design to translate English into Solresol and then be played musically.

## Usage
```sh
    git clone https://github.com/aaron-santos/solresol.git
    cd solresol
    lein repl
```
```clj
    ;; Let's play a phrase!
    ;; note the infinitive "to be" is used in place of am.
    ;; See http://mozai.com/writing/not_mine/solresol/#vbs
    ;; for notes on using different verb tenses.
    (player (now) 338 (take num-notes
                            (map (partial + 60) (apply concat (phrase->notes [:I :be :happy])))))
    
    
    ;; How about a haiku where each line is played simultaneously!
    ;; (for a very loose definition of haiku)
    (let [slow-speed      722
          fast-speed (* 101 (/ slow-speed 200.0))]
      (player (now) slow-speed
        (map (partial + 60) (apply concat (phrase->notes [:summer :universe]))))
      (player (now) fast-speed
        (map (partial + 48) (apply concat (phrase->notes [:orchestra :meet :everywhere]))))
      (player (now) slow-speed
        (map (partial + 72) (apply concat (phrase->notes [:good-day :tomorrow])))))
```
## For more information about the Solresol language check these out!
http://en.wikipedia.org/wiki/Solresol

http://mozai.com/writing/not_mine/solresol/

http://www.ifost.org.au/~gregb/solresol/sorsolex.htm

http://www.datapacrat.com/True/LANG/SOLRESOL/DICTIONA.HTM

http://solresol.blogspot.com/2011/08/solresol-english-dictionary.html

## License

Copyright © 2012 Aaron Santos

Distributed under the Eclipse Public License, the same as Clojure.
