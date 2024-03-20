def floodFill(self, image, sr, sc, color):
    original=image[sr][sc]
    m=len(image)
    n=len(image[0])
    if original==color:
        return image
    image[sr][sc]=color
    if sr<m-1 and image[sr+1][sc]==original:
        image=floodFill(self, image, sr+1, sc, color)
    if sr>0 and image[sr-1][sc]==original:
        image=floodFill(self, image, sr-1, sc, color)
    if sc<n-1 and image[sr][sc+1]==original:
        image=floodFill(self, image, sr, sc+1, color)
    if sc>0 and image[sr][sc-1]==original:
        image=floodFill(self, image, sr, sc-1, color)
    return image

image = [[1,1,1],
        [1,1,0],
        [1,0,1]]

print(floodFill(None, image, 1, 1, 2))