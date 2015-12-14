(ns cloodle.core
  (:require [goog.dom :as gdom]
            [om.next :as om :refer-macros [defui]]
            [om.dom :as dom]))

(enable-console-print!)

(defui HelloWorld
  Object
  (render
   [this]
   (dom/div nil (get (om/props this) :title))))

(def hello (om/factory HelloWorld))

(js/ReactDOM.render
 (hello {:title "Hello, World 2!"})
 (gdom/getElement "app"))
