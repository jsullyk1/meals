;; (ns user
;;   (:require
;;     [meals.schema :as s]
;;     [com.walmartlabs.lacinia :as lacinia]))

;; (def schema (s/load-schema))

;; (defn q
;;   [query-string]
;;   (lacinia/execute schema query-string nil nil))
