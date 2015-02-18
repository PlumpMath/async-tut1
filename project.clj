(defproject async-tut1 "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2760"]
                 [figwheel "0.2.3-SNAPSHOT"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]

  :node-dependencies [[source-map-support "0.2.8"]]

  :plugins [[lein-cljsbuild "1.0.4"]
            [lein-figwheel "0.2.3-SNAPSHOT"]
            [lein-npm "0.4.0"]]

  :source-paths ["src" "target/classes"]

  :clean-targets ["resources/public/out" "resources/public/out-adv"]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src" "dev_src"]
              :compiler {
                :main async-tut1.dev
                :output-to "resources/public/out/async_tut1.js"
                :output-dir "resources/public/out"
                :optimizations :none
                :cache-analysis true
                :asset-path "out"
                :source-map true}}
             {:id "release"
              :source-paths ["src"]
              :compiler {
                :main async-tut1.core
                :output-to "resources/public/out-adv/async_tut1.min.js"
                :output-dir "resources/public/out-adv"
                :optimizations :advanced
                :pretty-print false}}]}

  :figwheel {:http-server-root "public"})
